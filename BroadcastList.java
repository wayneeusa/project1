///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:  WHATSAPP
// File:             BroadcastList.java
// Semester:         367 Spring 2016
//
// Author:           Wayne Eternicka  eternicka@wisc.edu
// CS Login:         eternicka
// Lecturer's Name:  Deb Deppeler
// Lab Section:      N/A
//
//////////////////////////////////////////////////////////////////////////////

import java.util.List;

/**
 * This is the broadcast list class which captures information of a broadcast
 * list
 *
 * @author jmishra
 */
public class BroadcastList
{

    //TODO: Add class fields here
    private String nickname;  //nickname of the broadcast list
    private List<String> members; //list of nicknames of members

    /**
     * Constructs a new instance of this class. nickname cannot be null or
     * empty. members cannot be null.
     *
     * @param nickname the nickname of the broadcast list
     * @param members the list of nicknames of all members of this list
     * @throws WhatsAppRuntimeException throw a new instance of this with
     * CANT_BE_EMPTY_OR_NULL message if the validation of nickname or members
     * fails
     *
     */
    public BroadcastList(String nickname, List<String> members)
            throws WhatsAppRuntimeException
    {
        //TODO

        this.nickname = nickname;
        this.members = members;



    }

    /**
     * A getter of the nickname
     *
     * @return the nickname of the broadcast list
     */
    public String getNickname()
    {
        //TODO
        return this.nickname;
    }

    /**
     * A setter of the nickname of this broadcast list
     *
     * @param nickname the nickname of this broadcast list
     */
    public void setNickname(String nickname)
    {
        //TODO
        this.nickname = nickname;
    }

    /**
     * A getter of the list of members of this broadcast list
     *
     * @return the list of members of this broadcast list
     */
    public List<String> getMembers()
    {
        //TODO
        return this.members;
    }

    /**
     * A setter of the list of members of this broadcast list
     *
     * @param members the list of members of this broadcast list
     */
    public void setMembers(List<String> members)
    {
        //TODO
        this.members = members;
    }

}