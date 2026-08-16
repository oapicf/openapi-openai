
/*
 * UsageTimeBucket.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_UsageTimeBucket_H_
#define TINY_CPP_CLIENT_UsageTimeBucket_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "UsageTimeBucket_result_inner.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class UsageTimeBucket{
public:

    /*! \brief Constructor.
	 */
    UsageTimeBucket();
    UsageTimeBucket(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UsageTimeBucket();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getObject();

	/*! \brief Set 
	 */
	void setObject(std::string  object);
	/*! \brief Get 
	 */
	int getStartTime();

	/*! \brief Set 
	 */
	void setStartTime(int  start_time);
	/*! \brief Get 
	 */
	int getEndTime();

	/*! \brief Set 
	 */
	void setEndTime(int  end_time);
	/*! \brief Get 
	 */
	std::list<UsageTimeBucket_result_inner> getResult();

	/*! \brief Set 
	 */
	void setResult(std::list <UsageTimeBucket_result_inner> result);


    private:
    std::string object{};
    int start_time{};
    int end_time{};
    std::list<UsageTimeBucket_result_inner> result;
};
}

#endif /* TINY_CPP_CLIENT_UsageTimeBucket_H_ */
