class Main
  def self.run
    arr = [93, 2, 47, 1, 3]    
    puts "#{arr}"
    result =  quick_sort(arr, 0 , arr.length - 1)
    puts "- - result - -"
    puts "#{result}"

  end

  def self.quick_sort(arr, left, right)
    if left < right
      index = partition(arr, left, right)
      quick_sort(arr, left, index - 1)
      quick_sort(arr, index + 1, right)
    end
    arr
  end

  def self.partition(arr, left, right)
    pivot = arr[right]
    p_index = left

    (left).upto(right ).each do |i|
      if arr[i] < pivot
        arr[p_index], arr[i] = arr[i], arr[p_index]
        p_index = p_index + 1
      end
    end
    arr[p_index], arr[right] = arr[right], arr[p_index]
    p_index
  end

end


Main.run