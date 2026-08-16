
/*
 * CreateModerationRequest_model.h
 *
 * The content moderation model you would like to use. Learn more in [the moderation guide](/docs/guides/moderation), and learn about available models [here](/docs/models#moderation). 
 */

#ifndef TINY_CPP_CLIENT_CreateModerationRequest_model_H_
#define TINY_CPP_CLIENT_CreateModerationRequest_model_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The content moderation model you would like to use. Learn more in [the moderation guide](/docs/guides/moderation), and learn about available models [here](/docs/models#moderation). 
 *
 *  \ingroup Models
 *
 */

class CreateModerationRequest_model{
public:

    /*! \brief Constructor.
	 */
    CreateModerationRequest_model();
    CreateModerationRequest_model(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateModerationRequest_model();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_CreateModerationRequest_model_H_ */
