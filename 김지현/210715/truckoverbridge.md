


> 

## 다리를 지나는 트럭
어렵지 않은 문제를 어렵게 보는 경향이 있는 듯..
stack을 만들때는 길이 만큼 0을 채워주는것도 방법인듯 하다 


    def solution(bridge_length, weight, truck_weights):
	    bridge = [0]*bridge_length # 길이만큼 bridge를 만들어줌
	    time =0
	    while bridge:
	        time +=1
	        bridge.pop(0) # 트럭을 타기 위해 비워준다
	        
	        if truck_weights:
	            if truck_weights[0] + sum(bridge) <= weight:
	                bridge.append(truck_weights.pop(0)) # 길이보다 작을때 추가
	            else:
	                bridge.append(0)   #길이보다 클때 추가 
	    return time


