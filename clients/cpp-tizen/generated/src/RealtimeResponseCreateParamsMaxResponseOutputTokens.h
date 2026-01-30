/*
 * RealtimeResponseCreateParams_max_response_output_tokens.h
 *
 * Maximum number of output tokens for a single assistant response, inclusive of tool calls. Provide an integer between 1 and 4096 to limit output tokens, or &#x60;inf&#x60; for the maximum available tokens for a given model. Defaults to &#x60;inf&#x60;. 
 */

#ifndef _RealtimeResponseCreateParams_max_response_output_tokens_H_
#define _RealtimeResponseCreateParams_max_response_output_tokens_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Maximum number of output tokens for a single assistant response, inclusive of tool calls. Provide an integer between 1 and 4096 to limit output tokens, or `inf` for the maximum available tokens for a given model. Defaults to `inf`. 
 *
 *  \ingroup Models
 *
 */

class RealtimeResponseCreateParams_max_response_output_tokens : public Object {
public:
	/*! \brief Constructor.
	 */
	RealtimeResponseCreateParams_max_response_output_tokens();
	RealtimeResponseCreateParams_max_response_output_tokens(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RealtimeResponseCreateParams_max_response_output_tokens();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);


private:
	void __init();
	void __cleanup();

};
}
}

#endif /* _RealtimeResponseCreateParams_max_response_output_tokens_H_ */
