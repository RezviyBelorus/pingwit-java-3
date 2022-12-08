package org.example.lec_7.practice.task_0_interface;

public class Sound implements A, B {

    @Override
    public String getVoice() {
        String voiceFromA = A.super.getVoice();
        String voiceFromB = B.super.getVoice();

        return voiceFromA + voiceFromB;
    }

    public static void main(String[] args) {
        Sound sound = new Sound();

        String voice = sound.getVoice();
        System.out.println(voice);
    }
}
