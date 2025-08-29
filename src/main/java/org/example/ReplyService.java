package org.example;

/**
 * Students implement this method to return the exact outputs defined in README.
 */
public class ReplyService {

    public String reply(String message, ReplyType type) {
        if (message ==null|| message.trim().isEmpty()){
            return "Please say something.";
        }
        String normalized = message.trim().toLowerCase();
        switch (normalized){
            case "hi":
                return getreply(type,"Hello. How may I assist you today?",
                        "Hey there! 😊 How can I help?",
                        "Hello. How can I help?");
            case "hello":
                return getreply(type,"Hello. How may I assist you today?",
                        "Hi! 👋 What’s up?",
                        "Hello. How can I help?");
            case "how are you":
                return getreply(type,"I am functioning properly. How may I assist you?",
                        "Doing great! 😄 How can I help?",
                        "I’m good. How can I help?");
            case "i need help":
                return getreply(type,"I can assist with that. Please provide more details.",
                        "I’ve got you! 🙂 Tell me a bit more.",
                        "Share details; I’ll help.");
            case "can you help me with my account":
                return getreply(type,
                        "Certainly. Please describe the account issue.",
                        "Sure thing! 😊 What’s wrong with the account?",
                        "Describe the account issue…");
            case "thanks":
                return getreply(type,
                        "You are welcome.",
                        "Anytime! 🙌",
                        "You’re welcome.");
            case "bye":
                return getreply(type,
                        "Goodbye.",
                        "See you later! 👋",
                        "Goodbye.");
            case "what is your name":
                return getreply(type,
                        "I am your virtual assistant.",
                        "I’m your helper bot 🤖",
                        "I’m your assistant.");
            default:

                return getreply(type,
                        "Could you clarify your request?",
                        "Could you tell me more?",
                        "Please clarify.");


        }
    }

    String getreply(ReplyType type, String formal, String friendly, String concise){
            switch (type){
                case FORMAL: return formal;
                case FRIENDLY: return friendly;
                case CONCISE: return concise;
                default: return "Please say something";
            }
    }
}
