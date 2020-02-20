/**
 * implements : 구현하다.
 * interface간의 관계는 implements를 통해 확보
 * - 단일 상속의 약점을 극복. 다중상속 방법 제공
 * - implements 뒤에 올 수 있는 interface 갯수에 제한이 없음
 * - 연관성 없는 class들에게 연관성 부여
 * @author multicampus
 *
 */

interface AAA{}
interface DDD{}
class CCC{}
class ClassB extends CCC implements AAA, DDD{}
/**
 * interface 간의 implements를 통한 상속이 가능
 * interface 간의 상속은 다중 상속이 가능
 * interface 간의 다중 상속 가능 이유는 상수와 미완성 메소드만 상속되기 때문에 상속의 모호성이 없음
 * 구현부가 없어서 다중 상속의 모호성이 없음
 * @author multicampus
 *
 */
public class Interface3Implements {

}
