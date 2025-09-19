class Spreadsheet {
    HashMap<String, Integer> ls;

    public Spreadsheet(int rows) {
        ls = new HashMap<>();
    }

    public void setCell(String cell, int value) {
        ls.put(cell, value);
    }

    public void resetCell(String cell) {
        ls.put(cell, 0);
    }

    public int getValue(String f) {
        f = f.substring(1); // remove '='
        String arr[] = f.split("\\+");
        int sum = 0;

        // handle first part
        if (arr[0].matches("\\d+")) {
            sum += Integer.parseInt(arr[0]);
        } else {
            sum += ls.getOrDefault(arr[0], 0);
        }

        // handle second part
        if (arr[1].matches("\\d+")) {
            sum += Integer.parseInt(arr[1]);
        } else {
            sum += ls.getOrDefault(arr[1], 0);
        }

        return sum;
    }
}
