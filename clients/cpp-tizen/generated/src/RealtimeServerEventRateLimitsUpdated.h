/*
 * RealtimeServerEventRateLimitsUpdated.h
 *
 * Emitted at the beginning of a Response to indicate the updated rate limits.  When a Response is created some tokens will be \&quot;reserved\&quot; for the output  tokens, the rate limits shown here reflect that reservation, which is then  adjusted accordingly once the Response is completed. 
 */

#ifndef _RealtimeServerEventRateLimitsUpdated_H_
#define _RealtimeServerEventRateLimitsUpdated_H_


#include <string>
#include "RealtimeServerEventRateLimitsUpdated_rate_limits_inner.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Emitted at the beginning of a Response to indicate the updated rate limits.  When a Response is created some tokens will be \"reserved\" for the output  tokens, the rate limits shown here reflect that reservation, which is then  adjusted accordingly once the Response is completed. 
 *
 *  \ingroup Models
 *
 */

class RealtimeServerEventRateLimitsUpdated : public Object {
public:
	/*! \brief Constructor.
	 */
	RealtimeServerEventRateLimitsUpdated();
	RealtimeServerEventRateLimitsUpdated(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RealtimeServerEventRateLimitsUpdated();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The unique ID of the server event.
	 */
	std::string getEventId();

	/*! \brief Set The unique ID of the server event.
	 */
	void setEventId(std::string  event_id);
	/*! \brief Get The event type, must be `rate_limits.updated`.
	 */
	std::string getType();

	/*! \brief Set The event type, must be `rate_limits.updated`.
	 */
	void setType(std::string  type);
	/*! \brief Get List of rate limit information.
	 */
	std::list<RealtimeServerEventRateLimitsUpdated_rate_limits_inner> getRateLimits();

	/*! \brief Set List of rate limit information.
	 */
	void setRateLimits(std::list <RealtimeServerEventRateLimitsUpdated_rate_limits_inner> rate_limits);

private:
	std::string event_id;
	std::string type;
	std::list <RealtimeServerEventRateLimitsUpdated_rate_limits_inner>rate_limits;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RealtimeServerEventRateLimitsUpdated_H_ */
