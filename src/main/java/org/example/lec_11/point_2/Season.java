package org.example.lec_11.point_2;

public enum Season {
    WINTER(3, -5) {
        @Override
        public boolean needSocks() {
            return true;
        }
    },
    SPRING(4, 7) {
        @Override
        public boolean needSocks() {
            return true;
        }
    },
    SUMMER(3, 25) {
        @Override
        public boolean needSocks() {
            return false;
        }
    },
    AUTUMN(2, 8) {
        @Override
        public boolean needSocks() {
            return false;
        }
    };

    private Integer monthQuantity;
    private Integer averageTemperature;

    Season(Integer monthQuantity, Integer averageTemperature) {
        this.monthQuantity = monthQuantity;
        this.averageTemperature = averageTemperature;
    }

    public Integer getMonthQuantity() {
        return monthQuantity;
    }

    public Integer getAverageTemperature() {
        return averageTemperature;
    }

    public abstract boolean needSocks();
}
