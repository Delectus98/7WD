public Scene extends Screen {
    private final SceneControler controler;
     
    public void add(Button button, Screen nextScreen){
          button.setEvent(Button.RELEASED, () -> {controler.setCurrentScreen(nextScreen)});
    }
     
    public void update(){}
}
