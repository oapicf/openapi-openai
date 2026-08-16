
/*
 * PredictionContent_content.h
 *
 * The content that should be matched when generating a model response. If generated tokens would match this content, the entire model response can be returned much more quickly. 
 */

#ifndef TINY_CPP_CLIENT_PredictionContent_content_H_
#define TINY_CPP_CLIENT_PredictionContent_content_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ChatCompletionRequestMessageContentPartText.h"

namespace Tiny {


/*! \brief The content that should be matched when generating a model response. If generated tokens would match this content, the entire model response can be returned much more quickly. 
 *
 *  \ingroup Models
 *
 */

class PredictionContent_content{
public:

    /*! \brief Constructor.
	 */
    PredictionContent_content();
    PredictionContent_content(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PredictionContent_content();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_PredictionContent_content_H_ */
