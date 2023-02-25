public class Mood {
    private enum dreamMood {
        NIGHTMARE,
        SAD,
        ANGRY,
        NEUTRAL,
        HAPPY,
        HORNY,
        ECSTATIC
    }

    Mood currentMood;
    public Mood(dreamMood thisMood){
        this.currentMood = thisMood;
    }
}
