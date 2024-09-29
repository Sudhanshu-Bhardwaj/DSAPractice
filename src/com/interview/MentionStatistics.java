package com.interview;

import java.util.*;
import java.util.regex.*;

public class MentionStatistics {
    public static String[] solution(String[] members, String[] messages) {
        // Map to store the count of mentions for each user
        Map<String, Integer> mentionCount = new HashMap<>();

        // Regular expression pattern to find mentions
        Pattern pattern = Pattern.compile("@id\\d{1,3}");

        for (String message : messages) {
            // Set to store unique mentions in a single message
            Set<String> seenMentions = new HashSet<>();

            Matcher matcher = pattern.matcher(message);
            while (matcher.find()) {
                seenMentions.add(matcher.group());
            }

            // Increment mention count for each unique mention
            for (String mention : seenMentions) {
                String userId = mention.substring(1); // remove the '@' character
                mentionCount.put(userId, mentionCount.getOrDefault(userId, 0) + 1);
            }
        }

        // Create the result list
        List<String> result = new ArrayList<>();
        for (String member : members) {
            String count = mentionCount.getOrDefault(member, 0).toString();
            result.add(member + "=" + count);
        }

        // Sort the result by mention count in descending order, and by user id in case of a tie
        result.sort((a, b) -> {
            int countA = Integer.parseInt(a.split("=")[1]);
            int countB = Integer.parseInt(b.split("=")[1]);
            if (countB != countA) {
                return Integer.compare(countB, countA); // descending order by count
            } else {
                return a.split("=")[0].compareTo(b.split("=")[0]); // lexicographical order by user id
            }
        });

        // Convert the result list to an array and return
        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] members = {"id1", "id123", "id983", "id239"};
        String[] messages = {
                "This is an example with no mentions",
                "This is an example with @id1 one mention of one user",
                "This is an example with @id1, @id123, @id983 one mention of three users",
                "This is an example with @id1, @id123, @id983 several mentions of several users @id239"
        };

        String[] result = solution(members, messages);
        System.out.println(Arrays.toString(result));
    }
}
