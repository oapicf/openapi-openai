
/*
 * RealtimeSession_model.h
 *
 * The Realtime model used for this session. 
 */

#ifndef TINY_CPP_CLIENT_RealtimeSession_model_H_
#define TINY_CPP_CLIENT_RealtimeSession_model_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The Realtime model used for this session. 
 *
 *  \ingroup Models
 *
 */

class RealtimeSession_model{
public:

    /*! \brief Constructor.
	 */
    RealtimeSession_model();
    RealtimeSession_model(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RealtimeSession_model();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_RealtimeSession_model_H_ */
