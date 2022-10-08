package kodlamaio.business;

import kodlamaio.core.logging.Logger;
import kodlamaio.dataAccess.InstructorDao;
import kodlamaio.entities.Instructor;

public class InstructorManager implements InstructorService {

    private InstructorDao instructorDao;
    private Logger[] loggers;

    public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    @Override
    public void add(Instructor instructor) {
        instructorDao.add(instructor);

        for (Logger logger : loggers) {
            logger.log(instructor.getFirstName() + " isimli eğitmen eklendi");
        }
    }

    @Override
    public void delete(int instructorId) {
        instructorDao.delete(instructorId);

        for (Logger logger : loggers) {
            logger.log(instructorId + " nolu id'ye sahip eğitmen silindi");
        }
    }

    @Override
    public Instructor getById(int instructorId) {
        return this.instructorDao.getById(instructorId);
    }
    
}
