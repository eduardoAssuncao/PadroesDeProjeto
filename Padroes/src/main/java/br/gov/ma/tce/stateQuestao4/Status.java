package br.gov.ma.tce.stateQuestao4;

public enum Status {
    GESTACAO,
    CRIADO,
    FECHADO,
    EM_AVALIACAO,
    EM_RECURSO,
    INDEFERIDO,
    DEFERIDO,
    AVALIADO;

    public static Status from(Status estado1, Status estado2) {
        if ((estado1 == INDEFERIDO && estado2 == DEFERIDO) || (estado1 == DEFERIDO && estado2 == INDEFERIDO)) {
            return AVALIADO;
        }
        return null;
    }
}
