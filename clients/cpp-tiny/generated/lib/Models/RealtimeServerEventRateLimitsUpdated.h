
/*
 * RealtimeServerEventRateLimitsUpdated.h
 *
 * Emitted at the beginning of a Response to indicate the updated rate limits.  When a Response is created some tokens will be \&quot;reserved\&quot; for the output  tokens, the rate limits shown here reflect that reservation, which is then  adjusted accordingly once the Response is completed. 
 */

#ifndef TINY_CPP_CLIENT_RealtimeServerEventRateLimitsUpdated_H_
#define TINY_CPP_CLIENT_RealtimeServerEventRateLimitsUpdated_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "RealtimeServerEventRateLimitsUpdated_rate_limits_inner.h"
#include <list>

namespace Tiny {


/*! \brief Emitted at the beginning of a Response to indicate the updated rate limits.  When a Response is created some tokens will be \"reserved\" for the output  tokens, the rate limits shown here reflect that reservation, which is then  adjusted accordingly once the Response is completed. 
 *
 *  \ingroup Models
 *
 */

class RealtimeServerEventRateLimitsUpdated{
public:

    /*! \brief Constructor.
	 */
    RealtimeServerEventRateLimitsUpdated();
    RealtimeServerEventRateLimitsUpdated(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RealtimeServerEventRateLimitsUpdated();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string event_id{};
    std::string type{};
    std::list<RealtimeServerEventRateLimitsUpdated_rate_limits_inner> rate_limits;
};
}

#endif /* TINY_CPP_CLIENT_RealtimeServerEventRateLimitsUpdated_H_ */
