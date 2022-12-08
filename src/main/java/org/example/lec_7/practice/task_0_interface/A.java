package org.example.lec_7.practice.task_0_interface;

public interface A {

    default String getVoice() {
        return "Voice from A";
    }
}
