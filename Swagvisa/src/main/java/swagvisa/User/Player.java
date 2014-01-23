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
    
    private String name;
    private String team;
    
    
    public Player(String name) {
        this.name = name;
        this.team = name;
    }
    
    
    public Player(String name, String team) {
    this.name = name;
    this.team = team;
        
    }
    
    
    public String getName() {
        return this.name;
    }
    
    public String getTeam() {
        return this.team;
    }
    
}
