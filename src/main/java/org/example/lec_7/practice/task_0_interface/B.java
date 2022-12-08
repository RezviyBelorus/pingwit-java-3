package org.example.lec_7.practice.task_0_interface;

public interface B {
    default String getVoice() {
        return "Voice from B";
    }
}
