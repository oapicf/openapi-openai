
/*
 * RealtimeResponse_usage_output_token_details.h
 *
 * Details about the output tokens used in the Response.
 */

#ifndef TINY_CPP_CLIENT_RealtimeResponse_usage_output_token_details_H_
#define TINY_CPP_CLIENT_RealtimeResponse_usage_output_token_details_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Details about the output tokens used in the Response.
 *
 *  \ingroup Models
 *
 */

class RealtimeResponse_usage_output_token_details{
public:

    /*! \brief Constructor.
	 */
    RealtimeResponse_usage_output_token_details();
    RealtimeResponse_usage_output_token_details(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RealtimeResponse_usage_output_token_details();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The number of text tokens used in the Response.
	 */
	int getTextTokens();

	/*! \brief Set The number of text tokens used in the Response.
	 */
	void setTextTokens(int  text_tokens);
	/*! \brief Get The number of audio tokens used in the Response.
	 */
	int getAudioTokens();

	/*! \brief Set The number of audio tokens used in the Response.
	 */
	void setAudioTokens(int  audio_tokens);


    private:
    int text_tokens{};
    int audio_tokens{};
};
}

#endif /* TINY_CPP_CLIENT_RealtimeResponse_usage_output_token_details_H_ */
