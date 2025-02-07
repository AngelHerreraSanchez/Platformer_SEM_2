package entities;

import static utilz.Constants.PlayerConstants.GetSpriteAmount;

public class Enemy extends Entity {

    private int aniIndex;
    private int enemyState;
    private int enemyType;
    private int aniTick;
    private int aniSpeed = 25;



    public Enemy(float x, float y, int width, int height, int enemyType) {
        super(x, y, width, height);
        this.enemyType = new enemyType;
        initHitbox(x, y, width, height);
    }

    private void updateAnimationTick(){
        aniTick++;
        if(aniTick >= aniSpeed){
            aniTick = 0;
            aniIndex++;
        }
        if(aniIndex >= GetSpriteAmount(enemyType, enemyState){
            aniIndex = 0;
        }


    }

    // TODO: (2025-02-06):
    public void update() {
        updateAnimationTick();
    }

    // TODO: (2025-02-06):
    public int getAniIndex() {
        return aniIndex;
    }

    // TODO: (2025-02-06):
    public int getEnemyState() {
        return enemyState;
    }
}