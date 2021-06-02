//
// This file generated by rdl 1.5.2. Do not modify!
//

package com.yahoo.athenz.msd;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import com.yahoo.rdl.*;

//
// TransportPolicyMatch - Selector for the subject of a transport policy
//
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransportPolicyMatch {
    public TransportPolicySubject athenzService;
    public List<TransportPolicyCondition> conditions;

    public TransportPolicyMatch setAthenzService(TransportPolicySubject athenzService) {
        this.athenzService = athenzService;
        return this;
    }
    public TransportPolicySubject getAthenzService() {
        return athenzService;
    }
    public TransportPolicyMatch setConditions(List<TransportPolicyCondition> conditions) {
        this.conditions = conditions;
        return this;
    }
    public List<TransportPolicyCondition> getConditions() {
        return conditions;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != TransportPolicyMatch.class) {
                return false;
            }
            TransportPolicyMatch a = (TransportPolicyMatch) another;
            if (athenzService == null ? a.athenzService != null : !athenzService.equals(a.athenzService)) {
                return false;
            }
            if (conditions == null ? a.conditions != null : !conditions.equals(a.conditions)) {
                return false;
            }
        }
        return true;
    }
}