package CyberBeatBox;

import javax.sound.midi.MidiEvent;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.Track;
import javax.swing.*;
import java.util.ArrayList;

public class BeatBox {

    JPanel mainPanel;
    ArrayList<JCheckBox> checkBoxList;
    Sequencer sequencer;
    Sequence sequence;
    Track track;
    JFrame theFrame;

    String[] instrumentName = {"Bass Drum", "Closed Hi-Hat",
            "Open Hi-Hat", "Acoustic Snare", "Crash Cymbal", "Hand Clap",
            "High Tom", "Hi Bongo", "Maracas", "Whistle", "Low Conga",
            "Cow Bell", "Vibraslap", "Low-mid Tom", "High Agogo", "Open Hi Conga"};
    int[] instuments = {35, 42, 46, 38, 49, 39, 50, 60, 70, 72, 64, 56, 58, 47, 67, 63};

    public static void main(String[] args) {

        new BeatBox().builtGUI();

    }

    public void builtGUI() {



    }

    public void setUpMidi() {



    }

    public void buildTrackAndStart() {



    }

    public void makeTracks(int[] list) {



    }

    public MidiEvent makeEvent(int cmd, int chan, int one, int two, int tick) {

        MidiEvent event = null;


        return event;

    }

}
