
    //Non-Generic Version

	package library;

    import java.util.List;
    import java.util.ArrayList;

    public class BibliothekNG {
        private List<Media> resources = new ArrayList<Media>();
        public void addMedia(Media x) {
            resources.add(x);
        }
        public Media retrieveLast() {
            int size = resources.size();
            if (size > 0) {
                return (Media)resources.get(size - 1);
            }
            return null;
        }
        
        public Media get(int index) {
        		return resources.get(index);
        }
    }

    interface Media {
    }

    interface Buch extends Media {
    }

    interface Video extends Media {
    }

    interface Zeitung extends Media {
    }

