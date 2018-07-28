class Main
  def self.run
    arr = [93, 2, 47, 1, 902]
    puts insertion_sort(arr)
  end

  def self.insertion_sort(arr)
    (1).upto((arr.length - 1)).each do |i|
      key = arr[i]
      j = i - 1
      while (j >= 0 && key < arr[j])
        arr[j+1] = arr[j]
        j = j - 1
      end
      arr[j + 1] = key
    end
    arr
  end
end


Main.run