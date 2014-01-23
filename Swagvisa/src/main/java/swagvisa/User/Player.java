/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package swagvisa.User;

/**
 *
 * @author TonTTu
 */
public class Player {
    
    private Statistics stats;
    private final String name;
    private final String team;
    
    
    public Player(String name) {
        this.name = name;
        this.team = name;
        this.stats = new Statistics();
    }
    
    
    public Player(String name, String team) {
    this.name = name;
    this.team = team;
    this.stats = new Statistics();
        
    }
    
    
    public String getName() {
        return this.name;
    }
    
    public String getTeam() {
        return this.team;
    }
    
}
