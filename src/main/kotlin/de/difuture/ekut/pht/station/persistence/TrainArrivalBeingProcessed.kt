package de.difuture.ekut.pht.station.persistence

import de.difuture.ekut.pht.lib.registry.train.id.ITrainId
import de.difuture.ekut.pht.station.persistence.ITrainIdConverter
import javax.persistence.*


@Entity
data class TrainArrivalBeingProcessed(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int,

        @Column(nullable = false)
        @Convert(converter = ITrainIdConverter::class)
        val trainId : ITrainId
)