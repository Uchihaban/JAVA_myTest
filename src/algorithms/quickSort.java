/**
 * 
 */
/**
 * @author zhengban
 *
 */
package algorithms;

public class quickSort{
	

//一次划分的快速排序算法
public int partitionSort(int l[], int low, int high)
{
  //第一次快速排序，一般把第一个记录看成是枢轴记录,临时存放
  int temp = l[low];
  //设置枢轴记录
  int pivot = l[low];
  //扫描和比较终止的条件low=high
  while (low < high) {
      //先从 high 开始向前扫描第一个比枢轴记录小的记录，交换
      while (low < high && l[high] > pivot) {
          //找不到就继续扫描
          high--;
      }
      //找到了，把比枢轴记录小的，交换到低端
      l[low] = l[high];
      //循环交替扫描，从 low 开始向后扫描找第一个比枢轴大的记录，交换
      while (low < high && l[low] <= pivot) {
          //找不到就继续扫描
          low++;
      }
      //找到了，把比枢轴记录大的，交换到高端
      l[high] = l[low];
  }//end of while
  //一次排序终止，把枢轴记录放到终止位置
  l[low] = temp;
  //返回枢轴所在位置
  return low;//返回high也可以
}

//递归的思想完成完整的快速排序算法
public void quickSort(int l[], int low, int high)
{
  //对长度大于1的顺序表进行快速排序，先进行一次分割的划分
  if (low < high) {
      int pivot = partitionSort(l, low, high);
      //递归的分别对子序列进行一次划分快速排序的过程
      quickSort(l, low, pivot - 1);
      quickSort(l, pivot + 1, high);
  }
}

}