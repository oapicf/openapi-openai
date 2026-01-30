/*
 * RealtimeServerEventRateLimitsUpdated_rate_limits_inner.h
 *
 * 
 */

#ifndef _RealtimeServerEventRateLimitsUpdated_rate_limits_inner_H_
#define _RealtimeServerEventRateLimitsUpdated_rate_limits_inner_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class RealtimeServerEventRateLimitsUpdated_rate_limits_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	RealtimeServerEventRateLimitsUpdated_rate_limits_inner();
	RealtimeServerEventRateLimitsUpdated_rate_limits_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RealtimeServerEventRateLimitsUpdated_rate_limits_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The name of the rate limit (`requests`, `tokens`). 
	 */
	std::string getName();

	/*! \brief Set The name of the rate limit (`requests`, `tokens`). 
	 */
	void setName(std::string  name);
	/*! \brief Get The maximum allowed value for the rate limit.
	 */
	int getLimit();

	/*! \brief Set The maximum allowed value for the rate limit.
	 */
	void setLimit(int  limit);
	/*! \brief Get The remaining value before the limit is reached.
	 */
	int getRemaining();

	/*! \brief Set The remaining value before the limit is reached.
	 */
	void setRemaining(int  remaining);
	/*! \brief Get Seconds until the rate limit resets.
	 */
	long long getResetSeconds();

	/*! \brief Set Seconds until the rate limit resets.
	 */
	void setResetSeconds(long long  reset_seconds);

private:
	std::string name;
	int limit;
	int remaining;
	long long reset_seconds;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RealtimeServerEventRateLimitsUpdated_rate_limits_inner_H_ */
