package game.ghostStrategies;

// Giao diện mô tả hành động của các loại bóng ma khác nhau
public interface IGhostStrategy {
	int[] getChaseTargetPosition(); // Ô mục tiêu khi hồn ma đuổi theo Pacman

	int[] getScatterTargetPosition(); // Ô mục tiêu khi bóng ma tạm dừng

}
