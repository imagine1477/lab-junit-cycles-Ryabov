import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class OnlineOrderTest {

    private OnlineOrder order;
static int counter;
    @BeforeAll
    static void initAll() {
        counter=0;
        System.out.println("🔧 Запуск всех тестов для OnlineOrder. Инициализация общих ресурсов...");
    }

    @BeforeEach
    void setUp() {
        order = new OnlineOrder("Петров");
        System.out.println("Создан новый клиент для теста.");
        counter++;
    }

    @AfterEach
    void CounterCheck() {
        System.out.println("Счётчик заказов: "+counter);
    }

    @AfterAll
    static void counterShow() {
        System.out.println("Общее количество заказов: "+counter);
    }

    @Test
    @DisplayName("Тест: Проверка пустоты корзины и того что товар не доставлен ")
    void testCreate() {
        assertEquals(0,order.getItemCount());
        assertFalse(order.isDelivered());
        System.out.println("Выполняется testCreate");
    }

    @Test
    @DisplayName("Тест: Управление заказом")
    void testOrderControl() {
        order.addItem("Телефон");
        order.markDelivered();
        assertTrue(order.isDelivered());
        assertEquals(1, order.getItemCount());
        System.out.println("    ⚔️ Выполняется testOrderControl");
    }
}