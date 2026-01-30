/*
 * RealtimeResponse_usage.h
 *
 * Usage statistics for the Response, this will correspond to billing. A  Realtime API session will maintain a conversation context and append new  Items to the Conversation, thus output from previous turns (text and  audio tokens) will become the input for later turns. 
 */

#ifndef _RealtimeResponse_usage_H_
#define _RealtimeResponse_usage_H_


#include <string>
#include "RealtimeResponse_usage_input_token_details.h"
#include "RealtimeResponse_usage_output_token_details.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Usage statistics for the Response, this will correspond to billing. A  Realtime API session will maintain a conversation context and append new  Items to the Conversation, thus output from previous turns (text and  audio tokens) will become the input for later turns. 
 *
 *  \ingroup Models
 *
 */

class RealtimeResponse_usage : public Object {
public:
	/*! \brief Constructor.
	 */
	RealtimeResponse_usage();
	RealtimeResponse_usage(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RealtimeResponse_usage();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The total number of tokens in the Response including input and output  text and audio tokens. 
	 */
	int getTotalTokens();

	/*! \brief Set The total number of tokens in the Response including input and output  text and audio tokens. 
	 */
	void setTotalTokens(int  total_tokens);
	/*! \brief Get The number of input tokens used in the Response, including text and  audio tokens. 
	 */
	int getInputTokens();

	/*! \brief Set The number of input tokens used in the Response, including text and  audio tokens. 
	 */
	void setInputTokens(int  input_tokens);
	/*! \brief Get The number of output tokens sent in the Response, including text and  audio tokens. 
	 */
	int getOutputTokens();

	/*! \brief Set The number of output tokens sent in the Response, including text and  audio tokens. 
	 */
	void setOutputTokens(int  output_tokens);
	/*! \brief Get 
	 */
	RealtimeResponse_usage_input_token_details getInputTokenDetails();

	/*! \brief Set 
	 */
	void setInputTokenDetails(RealtimeResponse_usage_input_token_details  input_token_details);
	/*! \brief Get 
	 */
	RealtimeResponse_usage_output_token_details getOutputTokenDetails();

	/*! \brief Set 
	 */
	void setOutputTokenDetails(RealtimeResponse_usage_output_token_details  output_token_details);

private:
	int total_tokens;
	int input_tokens;
	int output_tokens;
	RealtimeResponse_usage_input_token_details input_token_details;
	RealtimeResponse_usage_output_token_details output_token_details;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RealtimeResponse_usage_H_ */
