/*
 * RealtimeResponse_usage_input_token_details.h
 *
 * Details about the input tokens used in the Response.
 */

#ifndef _RealtimeResponse_usage_input_token_details_H_
#define _RealtimeResponse_usage_input_token_details_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Details about the input tokens used in the Response.
 *
 *  \ingroup Models
 *
 */

class RealtimeResponse_usage_input_token_details : public Object {
public:
	/*! \brief Constructor.
	 */
	RealtimeResponse_usage_input_token_details();
	RealtimeResponse_usage_input_token_details(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RealtimeResponse_usage_input_token_details();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The number of cached tokens used in the Response.
	 */
	int getCachedTokens();

	/*! \brief Set The number of cached tokens used in the Response.
	 */
	void setCachedTokens(int  cached_tokens);
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
	int cached_tokens;
	int text_tokens;
	int audio_tokens;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RealtimeResponse_usage_input_token_details_H_ */
