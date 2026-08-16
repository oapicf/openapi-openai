
/*
 * RealtimeResponseCreateParams_max_response_output_tokens.h
 *
 * Maximum number of output tokens for a single assistant response, inclusive of tool calls. Provide an integer between 1 and 4096 to limit output tokens, or &#x60;inf&#x60; for the maximum available tokens for a given model. Defaults to &#x60;inf&#x60;. 
 */

#ifndef TINY_CPP_CLIENT_RealtimeResponseCreateParams_max_response_output_tokens_H_
#define TINY_CPP_CLIENT_RealtimeResponseCreateParams_max_response_output_tokens_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Maximum number of output tokens for a single assistant response, inclusive of tool calls. Provide an integer between 1 and 4096 to limit output tokens, or `inf` for the maximum available tokens for a given model. Defaults to `inf`. 
 *
 *  \ingroup Models
 *
 */

class RealtimeResponseCreateParams_max_response_output_tokens{
public:

    /*! \brief Constructor.
	 */
    RealtimeResponseCreateParams_max_response_output_tokens();
    RealtimeResponseCreateParams_max_response_output_tokens(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RealtimeResponseCreateParams_max_response_output_tokens();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_RealtimeResponseCreateParams_max_response_output_tokens_H_ */
