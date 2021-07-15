# 다른 사람 코드 봄
def solution(bridge_length, weight, truck_weights):
    time = 0
    on_bridge = [0]*bridge_length
    
    while on_bridge:
        time += 1
        on_bridge.pop()
        if truck_weights:
            if truck_weights[0]+sum(on_bridge) <= weight:
                on_bridge.insert(0, truck_weights.pop(0))
            else:
                on_bridge.insert(0, 0)
    return time