package lesson18;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Radion on 28.03.2017.
 */
public class Regex {
    public static void main(String[] args) {
        File directory = new File("src" + File.separator + "lesson18" + File.separator);
        File courses = new File(directory, "Courses.txt");
        File timeIntervals = new File(directory, "TimeIntervals.txt");
        File scheduleDescription = new File(directory, "ScheduleDescription.txt");

        ArrayList list = new ArrayList();
        ArrayList timeIntervalsList = new ArrayList();

        writeScheduleFileInArray(courses, list);
        writeReportWithTimeIntervals(timeIntervals, list);
        writeTimeIntervalInArray(list, timeIntervalsList);
        writeReportWithScheduleDescription(scheduleDescription, timeIntervalsList);
    }

    public static void writeScheduleFileInArray(File file, ArrayList list) {
        Pattern pattern = Pattern.compile("(?:(\\d{2}):(\\d{2})\\s([А-Яа-я\\s]*))|(?:^$)");
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)))) {
            int counter = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                Matcher matcher = pattern.matcher(line);
                matcher.find();
                if (matcher.group(1) != null) {
                    list.add(counter, matcher.group(1));
                    counter++;
                    list.add(counter, matcher.group(2));
                    counter++;
                    list.add(counter, matcher.group(3));
                    counter++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeReportWithTimeIntervals(File file, ArrayList list) {
        try (BufferedWriter reportWriter = new BufferedWriter(new FileWriter(file))) {
            for (int i = 0; i <= list.size() - 3; i += 3) {
                if (makeInt(list.get(i)) == 17 && makeInt(list.get(i + 1)) == 30) {
                    reportWriter.write(list.get(i) + ":" + list.get(i + 1) + " " + list.get(i + 2) + "\n");
                    reportWriter.write("\n");
                } else {
                    reportWriter.write(list.get(i) + ":" + list.get(i + 1) + "-" + list.get(i + 3) + ":"
                            + list.get(i + 4) + " " + list.get(i + 2) + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeTimeIntervalInArray(ArrayList fromList, ArrayList timeIntervalList) {
        int counter = 0;
        for (int i = 0; i <= fromList.size() - 3; i += 3) {
            if (makeInt(fromList.get(i)) == 17 && makeInt(fromList.get(i + 1)) == 30) {
                timeIntervalList.add(counter, fromList.get(i));
                counter++;
                timeIntervalList.add(counter, fromList.get(i + 1));
                counter++;
                timeIntervalList.add(counter, fromList.get(i));
                counter++;
                timeIntervalList.add(counter, fromList.get(i + 1));
                counter++;
                timeIntervalList.add(counter, fromList.get(i + 2));
                counter++;
            } else {
                timeIntervalList.add(counter, fromList.get(i));
                counter++;
                timeIntervalList.add(counter, fromList.get(i + 1));
                counter++;
                timeIntervalList.add(counter, fromList.get(i + 3));
                counter++;
                timeIntervalList.add(counter, fromList.get(i + 4));
                counter++;
                timeIntervalList.add(counter, fromList.get(i + 2));
                counter++;
            }
        }

    }

    public static void writeReportWithScheduleDescription(File file, ArrayList timeIntervalsList) {
        try (BufferedWriter reportWriter = new BufferedWriter(new FileWriter(file))) {
            HashMap<String, Integer> schedule = new HashMap<>();
            for (int i = 0; i <= timeIntervalsList.size() - 5; i += 5) {
                if (makeInt(timeIntervalsList.get(i)) == 17 && makeInt(timeIntervalsList.get(i + 1)) == 30) {
                    int allDayTime = convInMin(timeIntervalsList.get(i), timeIntervalsList.get(i + 1))
                            - convInMin(timeIntervalsList.get(0), timeIntervalsList.get(1));
                    int exerciseTime = schedule.get("Упражнения");
                    int solutionsTime = schedule.get("Решения");
                    int breakTime = schedule.get("Перерыв");
                    int lectionsTime = allDayTime - exerciseTime - solutionsTime - breakTime;
                    reportWriter.write("Лекции: " + lectionsTime + " минут " + lectionsTime * 100 / allDayTime + "%" + "\n"
                            + "Упражнения: " + exerciseTime + " минут " + exerciseTime * 100 / allDayTime + "%" + "\n"
                            + "Решения: " + solutionsTime + " минут " + solutionsTime * 100 / allDayTime + "%" + "\n"
                            + "Перерыв: " + breakTime + " минут " + breakTime * 100 / allDayTime + "%" + "\n"
                            + "\n");
                    schedule.clear();
                } else {
                    if (schedule.containsKey(timeIntervalsList.get(i + 4).toString())) {
                        schedule.put(timeIntervalsList.get(i + 4).toString(), schedule.get(timeIntervalsList.get(i + 4).toString())
                                + convInMin(timeIntervalsList.get(i + 2), timeIntervalsList.get(i + 3))
                                - convInMin(timeIntervalsList.get(i), timeIntervalsList.get(i + 1)));
                    } else {
                        schedule.put(timeIntervalsList.get(i + 4).toString(), convInMin(timeIntervalsList.get(i + 2),
                                timeIntervalsList.get(i + 3)) - convInMin(timeIntervalsList.get(i), timeIntervalsList.get(i + 1)));
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int makeInt(Object o) {
        return Integer.parseInt(String.valueOf(o));
    }

    public static int convInMin(Object hours, Object minutes) {
        return makeInt(hours) * 60 + makeInt(minutes);
    }
}
