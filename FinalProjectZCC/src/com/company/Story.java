package com.company;

public class Story {

    //STORY CLASS SO IT IS OBJECT-ORIENTED

    protected String link; //needs a link and a story
    protected String story;

    //CONSTRUCTOR

    public Story(String link, String story) {
        this.link = link;
        this.story = story;
    }

    /**
     // The set methods for the link and the story set the value in the main to what it is.
     // @param String
     */

    public void setLink(String link){
        this.link = link;
    }

    public void setStory(String story){
        this.story = story;
    }

    /**
     // The get methods for the link and the story gets the value that was given for them in the main class.
     // @param String
     // @returns String list or story
     */

    public String getLink(){
        return link;
    }

    public String getStory(){
        return story;
    }

    public Boolean isType(String testString, String type){ //Tests if specific input by user can be converted to a specific type.
        try {
            if (type.equalsIgnoreCase("float")) {
                Float.parseFloat(testString);
            }
            else if (type.equalsIgnoreCase("int")) {
                Integer.parseInt(testString);
            }
            else if (type.equalsIgnoreCase("double")) {
                Double.parseDouble(testString);
            }
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }


}
