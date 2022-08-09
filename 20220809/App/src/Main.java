public class Main extends Player {
    public static void main(String[] args) {
        Main main = new Main();
        main.play("펭수- 펭하");
        main.pause();
        main.stop();

    }

    @Override
    void pause() {
        // TODO Auto-generated method stub
        System.out.println("곡을 일시정지합니다.");
    }

    @Override
    void play(String songName) {
        // TODO Auto-generated method stub
        System.out.println(songName + "곡을 재생합니다.");
    }

    @Override
    void stop() {
        // TODO Auto-generated method stub
        System.out.println("곡을 정지합니다.");

    }
}
