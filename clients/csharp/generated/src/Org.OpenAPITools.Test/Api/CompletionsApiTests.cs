/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using Xunit;

using Org.OpenAPITools.Client;
using Org.OpenAPITools.Api;
// uncomment below to import models
//using Org.OpenAPITools.Model;

namespace Org.OpenAPITools.Test.Api
{
    /// <summary>
    ///  Class for testing CompletionsApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class CompletionsApiTests : IDisposable
    {
        private CompletionsApi instance;

        public CompletionsApiTests()
        {
            instance = new CompletionsApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of CompletionsApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' CompletionsApi
            //Assert.IsType<CompletionsApi>(instance);
        }

        /// <summary>
        /// Test CreateCompletion
        /// </summary>
        [Fact]
        public void CreateCompletionTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //CreateCompletionRequest createCompletionRequest = null;
            //var response = instance.CreateCompletion(createCompletionRequest);
            //Assert.IsType<CreateCompletionResponse>(response);
        }
    }
}
