
/*
 * RealtimeServerEventRateLimitsUpdated_rate_limits_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_RealtimeServerEventRateLimitsUpdated_rate_limits_inner_H_
#define TINY_CPP_CLIENT_RealtimeServerEventRateLimitsUpdated_rate_limits_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class RealtimeServerEventRateLimitsUpdated_rate_limits_inner{
public:

    /*! \brief Constructor.
	 */
    RealtimeServerEventRateLimitsUpdated_rate_limits_inner();
    RealtimeServerEventRateLimitsUpdated_rate_limits_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RealtimeServerEventRateLimitsUpdated_rate_limits_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
	long getResetSeconds();

	/*! \brief Set Seconds until the rate limit resets.
	 */
	void setResetSeconds(long  reset_seconds);


    private:
    std::string name{};
    int limit{};
    int remaining{};
    long reset_seconds{};
};
}

#endif /* TINY_CPP_CLIENT_RealtimeServerEventRateLimitsUpdated_rate_limits_inner_H_ */
