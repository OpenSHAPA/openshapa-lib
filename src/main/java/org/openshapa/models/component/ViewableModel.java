package org.openshapa.models.component;

/**
 * This model provides parameters used for determining what can be viewed on the
 * tracks information panel.
 */
public final class ViewableModel implements Cloneable {

    /** The end time of the longest track (offset included) in milliseconds */
    private long end;

    /** The pixel width of a time interval */
    private float intervalWidth;

    /** The time, in milliseconds, represented by an interval */
    private float intervalTime;

    /** The start time of the zoomed window */
    private long zoomWindowStart;

    /** The end time of the zoomed window */
    private long zoomWindowEnd;

    /**
     * Creates a new viewable model.
     */
    public ViewableModel() {
        // Empty constructor.
    }

    /**
     * Copy constructor.
     *
     * @param other Model to copy from.
     */
    protected ViewableModel(final ViewableModel other) {
        end = other.end;
        intervalWidth = other.intervalWidth;
        intervalTime = other.intervalTime;
        zoomWindowStart = other.zoomWindowStart;
        zoomWindowEnd = other.zoomWindowEnd;
    }

    /**
     * @return The end time of the longest track (offset included) in
     *         milliseconds
     */
    public long getEnd() {
        return end;
    }

    /**
     * Set the end time of the longest track (offset included) in milliseconds.
     *
     * @param end end time to use.
     */
    public void setEnd(final long end) {
        this.end = end;
    }

    /**
     * @return The time, in milliseconds, represented by an interval
     */
    public float getIntervalTime() {
        return intervalTime;
    }

    /**
     * Set the time, in milliseconds, represented by an interval.
     *
     * @param intervalTime interval time to use.
     */
    public void setIntervalTime(final float intervalTime) {
        this.intervalTime = intervalTime;
    }

    /**
     * @return The pixel width of a time interval
     */
    public float getIntervalWidth() {
        return intervalWidth;
    }

    /**
     * Set the pixel width of a time interval.
     *
     * @param intervalWidth interval width to use.
     */
    public void setIntervalWidth(final float intervalWidth) {
        this.intervalWidth = intervalWidth;
    }

    /**
     * @return The end time of the zoomed window
     */
    public long getZoomWindowEnd() {
        return zoomWindowEnd;
    }

    /**
     * Set the end time of the zoomed window.
     *
     * @param zoomWindowEnd zoom window end time
     */
    public void setZoomWindowEnd(final long zoomWindowEnd) {
        this.zoomWindowEnd = zoomWindowEnd;
    }

    /**
     * Set the start time of the zoomed window.
     *
     * @return The start time of the zoomed window
     */
    public long getZoomWindowStart() {
        return zoomWindowStart;
    }

    /**
     * Set the start time of the zoomed window
     *
     * @param zoomWindowStart
     */
    public void setZoomWindowStart(final long zoomWindowStart) {
        this.zoomWindowStart = zoomWindowStart;
    }

    @Override public boolean equals(final Object obj) {

        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        final ViewableModel other = (ViewableModel) obj;

        if (end != other.end) {
            return false;
        }

        if (intervalWidth != other.intervalWidth) {
            return false;
        }

        if (intervalTime != other.intervalTime) {
            return false;
        }

        if (zoomWindowStart != other.zoomWindowStart) {
            return false;
        }

        if (zoomWindowEnd != other.zoomWindowEnd) {
            return false;
        }

        return true;
    }

    @Override public int hashCode() {
        int hash = 7;
        hash = (79 * hash) + (int) (end ^ (end >>> 32));
        hash = (79 * hash) + Float.floatToIntBits(intervalWidth);
        hash = (79 * hash) + Float.floatToIntBits(intervalTime);
        hash = (79 * hash) + (int) (zoomWindowStart ^ (zoomWindowStart >>> 32));
        hash = (79 * hash) + (int) (zoomWindowEnd ^ (zoomWindowEnd >>> 32));

        return hash;
    }

    @Override public ViewableModel clone() {
        return new ViewableModel(this);
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ViewableModel [end=");
        builder.append(end);
        builder.append(", intervalTime=");
        builder.append(intervalTime);
        builder.append(", intervalWidth=");
        builder.append(intervalWidth);
        builder.append(", zoomWindowEnd=");
        builder.append(zoomWindowEnd);
        builder.append(", zoomWindowStart=");
        builder.append(zoomWindowStart);
        builder.append("]");

        return builder.toString();
    }
}
