
/*
 * RealtimeResponse_usage.h
 *
 * Usage statistics for the Response, this will correspond to billing. A  Realtime API session will maintain a conversation context and append new  Items to the Conversation, thus output from previous turns (text and  audio tokens) will become the input for later turns. 
 */

#ifndef TINY_CPP_CLIENT_RealtimeResponse_usage_H_
#define TINY_CPP_CLIENT_RealtimeResponse_usage_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "RealtimeResponse_usage_input_token_details.h"
#include "RealtimeResponse_usage_output_token_details.h"

namespace Tiny {


/*! \brief Usage statistics for the Response, this will correspond to billing. A  Realtime API session will maintain a conversation context and append new  Items to the Conversation, thus output from previous turns (text and  audio tokens) will become the input for later turns. 
 *
 *  \ingroup Models
 *
 */

class RealtimeResponse_usage{
public:

    /*! \brief Constructor.
	 */
    RealtimeResponse_usage();
    RealtimeResponse_usage(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RealtimeResponse_usage();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    int total_tokens{};
    int input_tokens{};
    int output_tokens{};
    RealtimeResponse_usage_input_token_details input_token_details;
    RealtimeResponse_usage_output_token_details output_token_details;
};
}

#endif /* TINY_CPP_CLIENT_RealtimeResponse_usage_H_ */
