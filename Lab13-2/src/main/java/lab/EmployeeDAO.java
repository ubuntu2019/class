package lab;

import java.util.List;

import org.springframework.stereotype.Repository;
import egovframework.rte.psl.dataaccess.EgovAbstractMapper;

@Repository("employeeDAO")
public class EmployeeDAO extends EgovAbstractMapper {

	public void insertEmployee(Employee vo) {
        insert("employee.insertEmployee", vo);
    }

    public int updateEmployee(Employee vo) {
        return update("employee.updateEmployee", vo);
    }
    
    public int deleteEmployee(Employee vo) {
        return delete("employee.deleteEmployee", vo);
    }

    public List<Employee> selectEmployeeList(Employee vo) {
        return selectList("employee.selectEmployeeList", vo);
    }

    public Employee selectEmployee(Employee vo) {
        return (Employee) selectOne("employee.selectEmployee", vo);
    }
	
}
