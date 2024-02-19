package Lesson21;

import Lesson18.FileCopyUtils;

public class CopyFileTaskImpl extends AbstractTask implements CopyFileTask {
    private String from;
    private String to;
    private FileCopyUtils copyUtils;

    public CopyFileTaskImpl() {
    }

    public CopyFileTaskImpl(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void setFileCopyUtils(FileCopyUtils copyUtils) {
        this.copyUtils = copyUtils;
    }

    @Override
    public void execute() throws TaskExecutionFailedException {
        try {
            copyUtils.copyFile(from, to);
        }catch (Exception e){
            throw new TaskExecutionFailedException(e.getMessage());
        }
    }


    @Override
    public String toString() {
        return "CopyFileTaskImpl{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", copyUtils=" + copyUtils +
                '}';
    }
}
