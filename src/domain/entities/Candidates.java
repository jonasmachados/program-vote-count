package domain.entities;

import java.util.Objects;

public class Candidates {

    private String name;
    private Integer numberVotes;

    //CONSTRUCTOR
    public Candidates(String name, Integer numberVotes) {
        this.name = name;
        this.numberVotes = numberVotes;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + Objects.hashCode(this.numberVotes);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Candidates other = (Candidates) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.numberVotes, other.numberVotes)) {
            return false;
        }
        return true;
    }

    //GET AND SET
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberVotes() {
        return numberVotes;
    }

    public void setNumberVotes(Integer numberVotes) {
        this.numberVotes = numberVotes;
    }

}
