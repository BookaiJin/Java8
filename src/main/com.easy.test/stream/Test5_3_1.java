package com.easy.test.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test5_3_1 {
    public static void main(String... args) {
        List<String> menu = Arrays.asList("beef", "egg");

        int t =
                menu.stream()
                        .map(m -> 1)
                        .reduce(0, Integer::sum);

        System.out.println(t);

        List<Session> sessions = Arrays.asList(
                new Session(new MeasureUnit(10)),
                new Session(new MeasureUnit(20)),
                new Session(new MeasureUnit(30)),
                new Session(new MeasureUnit(40)),
                new Session(new MeasureUnit(50)),
                new Session(new MeasureUnit(60)),
                new Session(new MeasureUnit(70)));

        mapReduce(sessions);
    }

    private static void mapReduce(List<Session> sessions) {
        long sessionCount = sessions.stream().count();
        int sessionCount1 = sessions.stream()
                .map(s -> 1)
                .reduce(0, Integer::sum);

        long cellCount = sessions.stream()
                .map(Session::getUnit)
                .mapToLong(MeasureUnit::getCount)
                .reduce(0, Long::sum);

        List<Session> sortedSessions = sessions.stream()
//                Session#getUnit is unavailable with reversed ???
//                .sorted(Comparator.comparingLong(s -> s.getUnit().getCount()).reversed())
                .sorted(Comparator.comparingLong(s -> s.getUnit().getCount()))
                .collect(Collectors.toList());
    }
}

class MeasureUnit {
    private long count;

    MeasureUnit(long count) {
        this.count = count;
    }

    long getCount() {
        return count;
    }
}

class Session {
    private MeasureUnit unit;

    Session(MeasureUnit unit) {
        this.unit = unit;
    }

    MeasureUnit getUnit() {
        return unit;
    }
}
