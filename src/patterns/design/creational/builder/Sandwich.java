package patterns.design.creational.builder;

public class Sandwich {
    private int noOfBeads;
    private int noOfOnions;
    private int noOfPickels;
    private Sandwich(Builder builder) {
        this.noOfBeads = builder.noOfBeads;
        this.noOfOnions = builder.noOfOnions;
        this.noOfPickels = builder.noOfPickels;
    }
    public int getNoOfBeads() {
        return noOfBeads;
    }

    public int getNoOfOnions() {
        return noOfOnions;
    }

    public int getNoOfPickels() {
        return noOfPickels;
    }
    public static Builder getBuilder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "noOfBeads=" + noOfBeads +
                ", noOfOnions=" + noOfOnions +
                ", noOfPickels=" + noOfPickels +
                '}';
    }

    static class Builder {
        private int noOfBeads;
        private int noOfOnions;
        private int noOfPickels;

        public int getNoOfBeads() {
            return noOfBeads;
        }

        public Builder setNoOfBeads(int noOfBeads) {
            this.noOfBeads = noOfBeads;
            return this;
        }

        public int getNoOfOnions() {
            return noOfOnions;
        }

        public Builder setNoOfOnions(int noOfOnions) {
            this.noOfOnions = noOfOnions;
            return this;
        }

        public int getNoOfPickels() {
            return noOfPickels;
        }

        public Builder setNoOfPickels(int noOfPickels) {
            this.noOfPickels = noOfPickels;
            return this;
        }
        public Sandwich build() {
            return new Sandwich(this);
        }
    }
}
