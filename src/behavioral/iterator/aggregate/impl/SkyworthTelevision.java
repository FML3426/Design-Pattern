package behavioral.iterator.aggregate.impl;

import behavioral.iterator.aggregate.Television;
import behavioral.iterator.TVIterator;

/**
 * Created by ML3426 on 2016/9/24.
 *
 * @author ML3426
 */
public class SkyworthTelevision implements Television {

    private String[] channels = {"CCTV-1", "CCTV-2", "CCTV-3", "CCTV-4",
            "CCTV-5", "CCTV-6", "CCTV-7", "CCTV-8"};

    @Override
    public TVIterator createIterator() {
        return new SkyworthIterator();
    }

    private class SkyworthIterator implements TVIterator {

        private int currentIndex = 0;

        @Override
        public void setChannel(int i) {
            currentIndex = i;
        }

        @Override
        public void next() {
            if (currentIndex < channels.length) {
                ++currentIndex;
            }
        }

        @Override
        public void previous() {
            if (currentIndex > 0) {
                --currentIndex;
            }
        }

        @Override
        public boolean isLast() {
            return currentIndex == channels.length - 1;
        }

        @Override
        public Object currentChannel() {
            return channels[currentIndex];
        }

        @Override
        public boolean isFirst() {
            return currentIndex == 0;
        }
    }
}
