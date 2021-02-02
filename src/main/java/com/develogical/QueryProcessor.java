package com.develogical;

public class QueryProcessor {

  public String process(String query) {
    if (query.toLowerCase().contains("shakespeare")) {
      return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
          "English poet, playwright, and actor, widely regarded as the greatest " +
          "writer in the English language and the world's pre-eminent dramatist.";
    } else if (query.toLowerCase().contains("kubrick")) {
      return "Stanley Kubrick ( July 26, 1928 – March 7, 1999) was an American film director,"
          + "producer, screenwriter, and photographer. He is frequently cited as one of the "
          + "greatest filmmakers in cinematic history. His films, which are mostly adaptations of "
          + "novels or short stories, cover a wide range of genres, and are noted for their "
          + "realism,dark humor, unique cinematography, extensive set designs, and evocative "
          + "use of music."
          ;
    }
    else if (query.toLowerCase().contains("what is your name")){
      return "Samuel Liem top boss man";
    }
    return "";
  }
}
