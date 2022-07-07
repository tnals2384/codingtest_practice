package org.javatutorials;

class Problem1 {
    public static String solution(String new_id) {
        String id;
        id = new_id.toLowerCase();
        new_id = new_id.replaceAll("([^(-_.a-z0-9])", "");
        new_id = new_id.replaceAll("[.]{2,}", ".");
        new_id = new_id.replaceAll("^[.]|[.]$", "");

        if (new_id.isEmpty())
            new_id = "a";
        if (new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
            new_id = new_id.replaceAll("^[.]|[.]$", "");
        }
        if (new_id.length() <= 2) {
            char ch = new_id.charAt(new_id.length() - 1);
            while (new_id.length() < 3) {
                id += ch;
            }
        }
        return id;
    }

    public static void main(String[] args) {

    }
}


