//package spring.gl.SD_CRUD.util;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.context.event.ApplicationReadyEvent;
//import org.springframework.context.ApplicationListener;
//import org.springframework.stereotype.Component;
//
//import lombok.RequiredArgsConstructor;
//import spring.gl.SD_CRUD.entity.Student;
//import spring.gl.SD_CRUD.repository.StudentRegistrationRepository;
//
//@Component
//@RequiredArgsConstructor
//public class BootStrapAppData implements ApplicationListener<ApplicationReadyEvent> {
//
//	@Autowired
//	private final StudentRegistrationRepository studentRegistrationRepository;
//
//	public void onApplicationEvent(ApplicationReadyEvent event) {
//		for (int i = 0; i < 10; i++) {
//			Student student = new Student();
//			student.setFirstName("Jupiter"+i);
//			student.setLastName("Ring"+i);
//			student.setCourse("Reading"+i);
//			student.setCountry("solar system"+i);
//			studentRegistrationRepository.save(student);
//		}
//	}
//}
